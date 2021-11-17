package comandero;


public class Empleado{
    //Instancia de clase pedido
    Pedido pedido = new Pedido();

    //Constructor vacío
    public Empleado() {
    }
    //Se llama al empleado a preparar el pedido
    public void prepararPedido(){
        pedido.cambiarEstado();
    }
    //El empleado busca la lista de pedidos sin preparar
    public void mostrarPedido (){
        pedido.mostrarPedidos();

    }
}