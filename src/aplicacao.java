public class aplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();


        carro1.setCor("azul");
        carro1.setModelo("BMW série 3");
        carro1.setCapacidadedoTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadedoTanque());
        System.out.println(carro1.valorTotaldoTanque(6.39));

        Carro carro2 = new Carro("cinza", "Mercedes bens Classe C" , 66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadedoTanque());
        System.out.println(carro2.valorTotaldoTanque(6.46));

    }


}
