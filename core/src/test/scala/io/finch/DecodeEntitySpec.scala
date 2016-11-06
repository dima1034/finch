package io.finch

import java.util.UUID

class DecodeEntitySpec extends FinchSpec {
  checkAll("Decode[String]", DecodeEntityLaws[String].all)
  checkAll("Decode[Int]", DecodeEntityLaws[Int].all)
  checkAll("Decode[Long]", DecodeEntityLaws[Long].all)
  checkAll("Decode[Boolean]", DecodeEntityLaws[Boolean].all)
  checkAll("Decode[Float]", DecodeEntityLaws[Float].all)
  checkAll("Decode[Double]", DecodeEntityLaws[Double].all)
  checkAll("Decode[UUID]", DecodeEntityLaws[UUID].all)
}
