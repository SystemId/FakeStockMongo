package Stocksvc.stocksvc

class Category(val name: String, val parent: Option[Category]) {
  
  def addFive(dx : Int , dy : Int) {
    name + dx
  }
  
}