package InputOutPut;

class CatWrapper extends Cat
{
 private Cat original;
 public CatWrapper(Cat cat)
 {
  this.original = cat;
 }

 public String getName()
 {
  return "��� �� ����� " + original.getName();
 }

 public void setName(String name)
 {
  original.setName(name);
 }
 
}