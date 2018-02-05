package cubic.complex

class CubicJSTest
  extends CubicTest {
  test("sweep") {
    check(
      rootSweep,
        n = 2730,
      max = 2.406e-7,
        μ = 1.145e-8,
        σ = 3.166e-8
    )
  }

  test("random roots") {
    check(
      randomCases,
        n = 1200,
      max = 1.365e-7,
        μ = 3.365e-9,
        σ = 1.076e-8
    )
  }
}
