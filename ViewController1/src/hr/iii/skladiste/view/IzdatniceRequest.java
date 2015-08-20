package hr.iii.skladiste.view;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class IzdatniceRequest {
    public IzdatniceRequest() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String refresh() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Execute");
        Object result = operationBinding.execute();
        OperationBinding operationBinding1 = bindings.getOperationBinding("Execute1");
        Object result1 = operationBinding1.execute();
        if (!operationBinding.getErrors().isEmpty() || !operationBinding1.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
}
