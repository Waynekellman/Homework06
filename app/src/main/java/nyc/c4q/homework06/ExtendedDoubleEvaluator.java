//package nyc.c4q.homework06;
//
//import java.util.Iterator;
//
//import com.fathzer.soft.javaluator.Constant;
//import com.fathzer.soft.javaluator.DoubleEvaluator;
//import com.fathzer.soft.javaluator.Function;
//import com.fathzer.soft.javaluator.Operator;
//import com.fathzer.soft.javaluator.Parameters;
//
///** A subclass of DoubleEvaluator that supports SQRT function.
// */
//public class ExtendedDoubleEvaluator extends DoubleEvaluator {
//    /**
//     * Defines the new function (square root).
//     */
//    private static final Function SQRT = new Function("sqrt", 1);
//    private static final Parameters PARAMS;
//    public static final Operator PERCENT = new Operator("&", 1, Operator.Associativity.LEFT, 3);
//    public static final Operator FACTORIAL = new Operator("!", 1, Operator.Associativity.LEFT, 3);
//    public static final Operator EXPONENT = new Operator("^", 2, Operator.Associativity.LEFT, 4);
//    public static final Function SINE = new Function("sin", 1);
//    public static final Function COSINEH = new Function("cosh", 1);
//    public static final Function TANGENTH = new Function("tanh", 1);
//    public static final Constant PI = new Constant("pi");
//
//
//    static {
//        // Gets the default DoubleEvaluator's parameters
//        PARAMS = DoubleEvaluator.getDefaultParameters();
//        // add the new sqrt function to these parameters
//        PARAMS.add(SQRT);
//        PARAMS.add(PERCENT);
//        PARAMS.add(FACTORIAL);
//        PARAMS.add(EXPONENT);
//        PARAMS.add(SINE);
//        PARAMS.add(COSINEH);
//        PARAMS.add(TANGENTH);
//        PARAMS.add(PI);
//    }
//
//    public ExtendedDoubleEvaluator() {
//        super(PARAMS);
//    }
//
//    @Override
//    protected Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
//        if (function == SQRT) {
//            // Implements the new function
//            return Math.sqrt(arguments.next());
//        } else {
//            // If it's another function, pass it to DoubleEvaluator
//            return super.evaluate(function, arguments, evaluationContext);
//        }
//
//    }
//
//    @Override
//    protected Double evaluate(Operator operator, Iterator<Double> operand, Object evaluationContext) {
//       int factorial = 1;
//        if (PERCENT.equals(operator)) {
//            return operand.next() * 0.01;
//        } else if (FACTORIAL.equals(operator)) {
//            int num = operand.next().intValue();
//            for (int i = 1; i < num; i++) {
//                factorial = i * factorial;
//            }
//            return factorial * 1.0;
//
//        } else {
//            return super.evaluate(operator, operand, evaluationContext);
//        }
//
//        @Override
//        protected Double evaluate(Constant Constant constant, Object evaluationContext) {
//            if (PI.equals(constant)) {
//                return Math.PI;
//            } else if (E.equals(constant)) {
//                return Math.E;
//            } else {
//                return super.evaluate(constant, evaluationContext);
//            }
//        }
//
//    }
//
//
//
//    }
//
