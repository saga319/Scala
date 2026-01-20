object colle{
    def main(args:Array[String]):Unit = {
        val lis = List(1,2,3,4,5,6)
        println(s"${lis(1)} ,accesing the elemet in list")
        for(i <- lis){
            println(i)
        }

        val arr = Array("hi","how","are")
        println(s"${arr(2)} ,accesing element in Array")
        for(j <- arr){
            println(j)
        }

        val se = Set(1,2,3,4,2)
        println(s"${se.contains(3)} => no index access only checking the condition in sets")
        for(k <- se){
            println(k)
        }
        val tu = Seq(1,"hi",2.0,true)
        val tuples = (12345,"sdfghj",'f',9.0,false)
        println(s"${tu(1)} => Seq is not acutal Collection its trait")
        println(tuples._1)

        val MapCol = Map("name" -> "Sagar","Dept" -> "HS","Id" -> 5362)
        println(MapCol.get("Id"))
        println(MapCol.values)
        println(MapCol.getOrElse("name","unknown"))
        println(MapCol.map(_._2))

        for(M <- MapCol){
            println(M)

        }
         val n = 9
         val list_data = List()
        for(o <- n until 3 by -2 ){
        println(Map(o -> list_data ))
    }
    println(list_data)

    val datass = List("ahj","bwert","werc","d")
    val enrichdata = datass.map(x=>(x,x+"h"))
    enrichdata.foreach(println)

        

    }
}