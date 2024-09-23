package dev.cheleb.ziojwt

import sttp.model.Uri

/** A trait to represent a token with an expiration date.
  */
trait WithToken {

  /** The token itself.
    */
  val token: String

  /** The expiration date of the token.
    */
  val expiration: Long
}
