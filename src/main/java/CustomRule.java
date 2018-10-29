import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;


public class CustomRule implements TestRule {
    public Statement apply(final Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                Rectangle rectangle = new Rectangle();
                base.evaluate();
            }
        };
    }
}