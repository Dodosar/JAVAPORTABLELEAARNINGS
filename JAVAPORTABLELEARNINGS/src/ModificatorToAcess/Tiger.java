package ModificatorToAcess;

class Tiger extends Cat
{
 public Tiger getMyParent()
 {
  return (Tiger) this.parent;
 }
}