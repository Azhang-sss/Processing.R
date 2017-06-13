
// Generated by hack/generate-e2e-test.py
package test.e2e.core.function;

import static org.junit.Assert.fail;
import org.junit.Test;
import test.e2e.core.E2eTestBase;

public class SpotLight1Test extends E2eTestBase {

  public SpotLight1Test() {
    coreCodeTemplate = "P3D <- \"processing.opengl.PGraphics3D\"\nPI <- pi\n\nsettings <- function() {\n    size(100, 100, P3D)\n}\n\ndraw <- function() {\n    background(0)\n    concentration = 600  # Try 1 -> 10000\n    background(0)\n    noStroke()\n    spotLight(51, 102, 126, 50, 50, 400, 0, 0, -1, PI/16, concentration)\n    translate(80, 50, 0)\n    sphere(30)\n    saveFrame(\"%s\")\n    exit()\n}\n";
    referenceURI = "https://processing.org/reference/images/spotLight_1.png";
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