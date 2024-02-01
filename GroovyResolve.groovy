
class GroovyResolve {
  static void main(String[] args) {
    def list = [1,3,4,5,1,5,4]
    println list.groupBy{it}.collect { k, v -> [k, v.count { it }] }
  }
}