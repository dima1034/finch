package io.finch

import java.util.UUID

import com.twitter.io.Buf

class BodySpec extends FinchSpec {

  behavior of "body*"

  def withBody(b: String): Input = Input.post("/").withBody[Text.Plain](Buf.Utf8(b))

  checkAll("Body[String]", EndpointLaws[String](bodyStringOption)(withBody).evaluating)
  checkAll("Body[Int]", EndpointLaws[Int](bodyStringOption)(withBody).evaluating)
  checkAll("Body[Long]", EndpointLaws[Long](bodyStringOption)(withBody).evaluating)
  checkAll("Body[Boolean]", EndpointLaws[Boolean](bodyStringOption)(withBody).evaluating)
  checkAll("Body[Float]", EndpointLaws[Float](bodyStringOption)(withBody).evaluating)
  checkAll("Body[Double]", EndpointLaws[Double](bodyStringOption)(withBody).evaluating)
  checkAll("Body[UUID]", EndpointLaws[UUID](bodyStringOption)(withBody).evaluating)
}
