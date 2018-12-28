package weixingongzhonghao.duotai;

class Useful{
    public void f(){};
}
class MoreUseful extends Useful{
    public void f(){};
    public void g(){};
}
public class RTTI {
    public static void main(String[] args){
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].f();
        //x[1].g();//Cannot resolve method 'g()'
        ((MoreUseful)x[1]).g();
        ((MoreUseful)x[0]).g();
    }
}
