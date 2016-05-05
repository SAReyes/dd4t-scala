package controllers

import javax.inject._

import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class PageController @Inject() extends Controller {

  def page(page: String) = Action {
   Ok("Not Implemented")
  }
}