val l = Seq(3,2,7,6,4,7,3,0,1)

def unique(list: Seq[Int]): Seq[Int] =
  list
    .foldLeft(Set.empty[Int]) {
      (set, value) =>
        if (set(value)) set else set + value
    }.toSeq


def unique2(list: Seq[Int]): Seq[Int] =
  list.distinct

def unique3(list: Seq[Int]): Seq[Int] =
  list.groupBy(a => a).keySet.toSeq

unique3(l)
