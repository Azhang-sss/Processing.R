
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class Lerp1Test extends E2eTestBase {

  public Lerp1Test() {
    coreCodeTemplate = "a = 20\nb = 80\nc = lerp(a, b, 0.2)\nd = lerp(a, b, 0.5)\ne = lerp(a, b, 0.8)\nbeginShape(POINTS)\nvertex(a, 50)\nvertex(b, 50)\nvertex(c, 50)\nvertex(d, 50)\nvertex(e, 50)\nendShape()\n\nsaveFrame(\"%s\")\nexit()\n";
    referenceURI = "https://processing.org/reference/images/lerp_0.png";
  }

  @Test
  public void test() {
    try {
      defaultOperation();
    } catch (Exception exception) {
      System.err.println(exception);
      fail("Should not have thrown any exception");
    }
  }
}
