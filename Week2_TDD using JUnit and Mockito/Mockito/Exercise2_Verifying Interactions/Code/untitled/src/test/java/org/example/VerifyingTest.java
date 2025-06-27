package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class VerifyingTest {

    @Test
    public void testVerifyInteraction() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        Myservice service=new Myservice(mockApi);
        service.fetchData();

        verify(mockApi).getData();
    }
}
