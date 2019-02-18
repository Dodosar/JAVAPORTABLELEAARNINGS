// ����������� ����� ������
public abstract class Figure{
     
    float x; // x-���������� �����
    float y; // y-���������� �����
  
    public Figure(float x, float y){
         
        this.x=x;
        this.y=y;
    }
    // ����������� ����� ��� ��������� ���������
    public abstract float getPerimeter();
    // ����������� ����� ��� ��������� �������
    public abstract float getArea();
}
// ����������� ����� ��������������
class Rectangle extends Figure
{
    private float width;
    private float height;
  
    // ����������� � ���������� � ������������ ������ Figure
    public Rectangle(float x, float y, float width, float height){
         
        super(x,y);
        this.width = width;
        this.height = height;
    }
     
    public float getPerimeter(){
         
        return width * 2 + height * 2;
    }
     
    public float getArea(){
         
        return width * height;
    }
}