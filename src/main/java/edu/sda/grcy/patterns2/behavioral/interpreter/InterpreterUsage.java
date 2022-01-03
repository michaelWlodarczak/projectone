package edu.sda.grcy.patterns2.behavioral.interpreter;

public class InterpreterUsage {
    public static void main(String[] args) {
        final MathOperationApplier mathOperationApplier = new MathOperationApplier();
        Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

        String result = interpreter.interpret("2 + 3 * 2"); // args[0]
        System.out.println(result);

        interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
        result = interpreter.interpret("3 ADD 3 EXPONENTIATION 2"); // args[1]
        System.out.println(result);
    }
}
