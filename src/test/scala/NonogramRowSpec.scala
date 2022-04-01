import org.scalatest._
import flatspec._
import matchers._
import NonogramRow._

class NonogramRowSpec extends AnyFlatSpec with should.Matchers {

  "checkRow()" should "take an binary Seq (consisting of only 0s and 1s) and return a Seq of positive integers " +
    "that represent the lengths of the sets of consecutive 1's in the input array, in order from left to right." in {

    checkRow(Seq.empty[Int]) shouldBe Seq.empty[Int]
    checkRow(Seq(0, 0, 0)) shouldBe Seq.empty[Int]

    checkRow(Seq(1,1,0,1,0,0,1,1,1,0,0)) shouldBe Seq(2, 1, 3)
    checkRow(Seq(0, 0, 1, 0, 1, 1, 1, 0, 0, 0)) shouldBe Seq(1, 3)
    checkRow(Seq(0, 1, 0)) shouldBe Seq(1)
    checkRow(Seq(1, 1, 1, 1, 1)) shouldBe Seq(5)
  }
}