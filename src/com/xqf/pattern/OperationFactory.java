
package com.xqf.pattern;


class OperationPlus extends Operation {
    @Override
    public double getResult() {
        return getA() + getB();
    }
}

class OperationSub extends Operation {
    @Override
    public double getResult() {
        return getA() - getB();
    }
}

class OperationMutiply extends Operation {
    @Override
    public double getResult() {
        return getA() * getB();
    }
}

class OperationDivide extends Operation {
    @Override
    public double getResult() {
        return getA() / getB();
    }
}


public class OperationFactory {
    public static Operation getOperationFromInfo(char c) {
        Operation result = null;
        switch (c) {
            case '+':
                result = new OperationPlus();
                break;
            case '-':
                result = new OperationSub();
                break;
            case '*':
                result = new OperationMutiply();
                break;
            case '/':
                result = new OperationDivide();
                break;
            default:
                break;
        }
        return result;
    }
}
