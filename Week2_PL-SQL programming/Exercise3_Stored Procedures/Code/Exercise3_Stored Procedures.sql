-- SCENARIO 1

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
  UPDATE Accounts
  SET Balance = Balance + (Balance * 0.01)
  WHERE AccountType = 'Savings';

  DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END;
/

-- SCENARIO 2

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
  p_DepartmentID IN NUMBER,
  p_BonusPercent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_BonusPercent / 100)
  WHERE DepartmentID = p_DepartmentID;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to Department ID: ' || p_DepartmentID);
END;
/


-- SCENARIO 3

CREATE OR REPLACE PROCEDURE TransferFunds (
  p_FromAccountID IN NUMBER,
  p_ToAccountID IN NUMBER,
  p_Amount IN NUMBER
) AS
  v_FromBalance NUMBER;
BEGIN
  
  SELECT Balance INTO v_FromBalance
  FROM Accounts
  WHERE AccountID = p_FromAccountID
  FOR UPDATE;

 
  IF v_FromBalance >= p_Amount THEN
   
    UPDATE Accounts
    SET Balance = Balance - p_Amount
    WHERE AccountID = p_FromAccountID;

    
    UPDATE Accounts
    SET Balance = Balance + p_Amount
    WHERE AccountID = p_ToAccountID;

    DBMS_OUTPUT.PUT_LINE('Transferred $' || p_Amount || 
                         ' from Account ' || p_FromAccountID || 
                         ' to Account ' || p_ToAccountID);
  ELSE
    DBMS_OUTPUT.PUT_LINE('Insufficient funds in Account ID: ' || p_FromAccountID);
  END IF;
EXCEPTION
  WHEN NO_DATA_FOUND THEN
    DBMS_OUTPUT.PUT_LINE('One or both account IDs are invalid.');
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/