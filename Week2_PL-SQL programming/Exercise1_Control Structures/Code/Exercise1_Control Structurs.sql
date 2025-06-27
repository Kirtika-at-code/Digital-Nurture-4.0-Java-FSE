-- SCENARIO 1

DECLARE
  CURSOR cust_cursor IS
    SELECT CustomerID, InterestRate
    FROM Loans
    WHERE CustomerID IN (
      SELECT CustomerID FROM Customers WHERE Age > 60
    );

BEGIN
  FOR loan_rec IN cust_cursor LOOP
    UPDATE Loans
    SET InterestRate = InterestRate - 1
    WHERE CustomerID = loan_rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE('1% discount applied to Customer ID: ' || loan_rec.CustomerID);
  END LOOP;
END;
/

--SCENARIO 2

DECLARE
  CURSOR vip_cursor IS
    SELECT CustomerID, Balance
    FROM Customers
    WHERE Balance > 10000;

BEGIN
  FOR cust_rec IN vip_cursor LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = cust_rec.CustomerID;

    DBMS_OUTPUT.PUT_LINE('VIP status granted to Customer ID: ' || cust_rec.CustomerID);
  END LOOP;
END;
/

-- SCENARIO 3

DECLARE
  CURSOR due_loans IS
    SELECT LoanID, CustomerID, DueDate
    FROM Loans
    WHERE DueDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
  FOR loan_rec IN due_loans LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.LoanID ||
                         ' for Customer ID ' || loan_rec.CustomerID ||
                         ' is due on ' || TO_CHAR(loan_rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;
/