import one.di.gof.Facade.Facade;
import one.di.gof.Singleton.SingletonApressado;
import one.di.gof.Singleton.SingletonLazyHolder;
import one.di.gof.Singleton.SingletonPreguicoso;
import one.di.gof.Strategy.Comportamento;
import one.di.gof.Strategy.ComportamentoAgressivo;
import one.di.gof.Strategy.ComportamentoDefensivo;
import one.di.gof.Strategy.ComportamentoNormal;
import one.di.gof.Strategy.Robo;

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // SINGLETON

        SingletonPreguicoso lazy = SingletonPreguicoso.getInstancia();
        System.out.println(lazy);
        SingletonApressado eager = SingletonApressado.getInstancia();
        System.out.println(eager);
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        // STRATEGY

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setStrategy(normal);

        robo.mover();
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        //FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "0582438");
    }
}
