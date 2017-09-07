var y = 0
(1 to 10000).foreach(_ => y = y + 1)
y

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
var x = 0
(1 to 10000).foreach(_ => Future { x = x + 1 })
x


