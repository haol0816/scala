class Counter (private var value:Int) {
def increment() {
if (value<=Int.MaxValue-1) {value +=1}
def current()=value
}
}

val mycounter = new Counter(Int.Maxvalue)
