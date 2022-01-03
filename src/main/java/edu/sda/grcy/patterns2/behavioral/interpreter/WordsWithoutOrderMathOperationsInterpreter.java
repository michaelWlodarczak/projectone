package edu.sda.grcy.patterns2.behavioral.interpreter;

public class WordsWithoutOrderMathOperationsInterpreter implements Interpreter {

    private final MathOperationApplier mathOperationApplier;

    private static final String INCORRECT_SYNTAX = "Expression is incorrect";

    public WordsWithoutOrderMathOperationsInterpreter(final MathOperationApplier mathOperationApplier) {
        this.mathOperationApplier = mathOperationApplier;
    }

    @Override
    public String interpret(String context) {
        final String[] splitData = context.trim().split(" ");

        if (splitData.length % 2 == 0) {
            return INCORRECT_SYNTAX;
        }

        Double value = Double.valueOf(splitData[0]);
        for (int i = 1; i < splitData.length - 1; i += 2) {
            value = mathOperationApplier.apply(extractOperation(splitData[i]), value, Double.valueOf(splitData[i + 1]));
        }
        return value.toString();
    }

    private MathOperation extractOperation(String operation) {
        return MathOperation.valueOf(operation);
    }


}
