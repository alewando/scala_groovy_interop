object ScalaToJava {
  def main(args: Array[String]) {
    val javaObj = new JavaObj()
    javaObj.someMethod().nestedMethod();
  }
}
