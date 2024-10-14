package one.di.gof.Singleton;

/**
 * Singleton Apressado/Eager
 * Ele já instancia na chamada da classe.
 * @author d1n35
 */
public class SingletonApressado {
    private static SingletonApressado instancia =  new SingletonApressado();

    private SingletonApressado(){
        super();
    }

    public static SingletonApressado getInstancia(){
        return instancia;
    }
}