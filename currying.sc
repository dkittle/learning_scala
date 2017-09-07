// Retail Game Price Calculator
//---------------------------------------------------------
// Build a function to calculate the store price for a game
// based on the price that the game studio charges.
// A studio sells to a warehouse - markup is always 50%
// A warehouse sells to a store - markup is always 30%

// This is an exercise to explore composition, currying
// and partial application

// This would really go to XE.com or something
def toCad(cost: Double): Double = cost * 1.33

def markup(percentage: Double)(cost: Double) = percentage * cost
def storeMarkup: Double => Double = markup(1.3)
def warehouseMarkup: Double => Double = markup(1.5)

def warehousePrice: Double => Double = toCad _ andThen warehouseMarkup
def storePrice: Double => Double = toCad _ andThen warehouseMarkup andThen storeMarkup

List(20.0, 25.0, 30.0).map(storePrice)

