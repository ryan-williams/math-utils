package hammerlab

import hammerlab.bool._

class BoolTest
  extends Suite {
  test("ops") {
    true | 4 should be(Some(4))
    false | 4 should be(None)
  }
}
