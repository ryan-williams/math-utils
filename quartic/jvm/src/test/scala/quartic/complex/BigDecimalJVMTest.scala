package quartic.complex

import org.hammerlab.math.polynomial.result.Stats

class BigDecimalJVMTest
  extends BigDecimalTest {

  val M = 2
  sweepTests(
    (4) →
      Stats(
        20,
        0,
        0,
        0
      ),
    (3,1) →
      Stats(
        80,
        1.29e-18,
        3.65e-18,
        1.58e-17
      ),
    (2,2) →
      Stats(
        40,
        0,
        0,
        0
      ),
    (2,1,1) →
      Stats(
        120,
        1.28e-16,
        2.71e-16,
        1.33e-15
      ),
    (1,1,1,1) →
      Stats(
        20,
        9.57e-17,
        1.21e-16,
        3.33e-16
      ),
    (2||1) →
      Stats(
        200,
        9.69e-17,
        1.77e-16,
        8.35e-16
      ),
    ((1,1)||1) →
      Stats(
        400,
        1.09e-16,
        1.07e-16,
        6.79e-16
      ),
    ||(2) →
      Stats(
        40,
        0,
        0,
        0
      ),
    ||(1,1) →
      Stats(
        180,
        9.27e-17,
        1.33e-16,
        4.99e-16
      )
  )

  val iterationsPerRootShape = 20
  gaussians(
    (4) →
      Stats(
        80,
        9.6e-34,
        1.37e-33,
        5.55e-33
      ),
    (3,1) →
      Stats(
        80,
        5.44e-12,
        4.99e-12,
        1.69e-11
      ),
    (2,2) →
      Stats(
        80,
        4.84e-17,
        6.05e-17,
        2.74e-16
      ),
    (2,1,1) →
      Stats(
        80,
        8.33e-16,
        2.58e-15,
        1.28e-14
      ),
    (1,1,1,1) →
      Stats(
        80,
        8.48e-16,
        2.1e-15,
        1.25e-14
      ),
    (2||1) →
      Stats(
        80,
        5.5e-16,
        1.8e-15,
        1.12e-14
      ),
    ((1,1)||1) →
      Stats(
        80,
        1.17e-16,
        1.13e-16,
        5.71e-16
      ),
    ||(2) →
      Stats(
        80,
        4.7e-17,
        8.16e-17,
        3.15e-16
      ),
    ||(1,1) →
      Stats(
        80,
        2.56e-16,
        2.2e-16,
        1.01e-15
      )
  )

  logNormals(
    (4) →
      Stats(
        80,
        3.24e-31,
        1.38e-30,
        6.32e-30
      ),
    (3,1) →
      Stats(
        80,
        5.81e-12,
        8.71e-12,
        4.48e-11
      ),
    (2,2) →
      Stats(
        80,
        8.29e-17,
        1.64e-16,
        7.73e-16
      ),
    (2,1,1) →
      Stats(
        80,
        2.13e-10,
        9.27e-10,
        4.45e-9
      ),
    (1,1,1,1) →
      Stats(
        80,
        4.15e-16,
        7.73e-16,
        3.82e-15
      ),
    (2||1) →
      Stats(
        80,
        1.86e-11,
        1.16e-10,
        7.45e-10
      ),
    ((1,1)||1) →
      Stats(
        80,
        1.45e-16,
        1.82e-16,
        9.28e-16
      ),
    ||(2) →
      Stats(
        80,
        2.88e-17,
        3.19e-17,
        1.01e-16
      ),
    ||(1,1) →
      Stats(
        80,
        5.36e-16,
        8.95e-16,
        4.84e-15
      )
  )

/*  val random =
    expected(
      Stats(
        180,
        8.29e-13,
        2.72e-12,
        1.83e-11
      ),
      Stats(
        180,
        1.18e-12,
        3.85e-12,
        2.54e-11
      )
    )

  val logNormalRandom =
    expected(
      Stats(
        180,
        2.87e-10,
        2.78e-9,
        3.23e-8
      ),
      Stats(
        180,
        6.99e-11,
        6.78e-10,
        8.22e-9
      )
    )*/
}
