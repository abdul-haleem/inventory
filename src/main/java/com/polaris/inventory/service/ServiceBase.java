package com.polaris.inventory.service;

import com.polaris.inventory.service.response.APIError;
import com.polaris.inventory.service.response.ServiceResponse;
import org.springframework.stereotype.Service;

@Service
public abstract class ServiceBase {

    private ServiceResponse<?> response;

    public void raiseError(String errorMessage, String developerMessage, boolean throwImmidiately){
        if (throwImmidiately)
            throw new RuntimeException(new APIError(errorMessage,developerMessage).toString());
        else {

            if (response == null)
                response = new ServiceResponse<Object>();

            response.addErrorMessage(errorMessage,developerMessage);
        }
    }
}
