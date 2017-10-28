val l = Seq(("A",2), ("B",1), ("A", 3))

def accum(listOfPairs:Seq[(String,Int)]): Seq[(String, Int)] =
  listOfPairs.groupBy(_._1)
    .mapValues(_.map(_._2).sum)
    .toList

def accum2(listOfPairs:Seq[(String,Int)]): Seq[(String, Int)]  =
  listOfPairs.foldLeft(Map.empty: Map[String, Int]) (
    (map, d) => {
      if (map.contains(d._1))
        map + (d._1 -> (map(d._1) + d._2))
      else
        map + (d._1 -> d._2)
    }
  ).toSeq

accum2(l)