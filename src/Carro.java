public class Carro {


        String cor;
        String modelo;
        int capacidadedoTanque;

        //construtor aqui

        Carro() {

        }

        Carro(String cor, String modelo, int capacidadedoTanque) {

            this.cor = cor;
            this.modelo = modelo;
            this.capacidadedoTanque = capacidadedoTanque;

    }

        void setCor(String cor) {
            this.cor = cor;
        }

        String getCor() {
            return cor;
        }

        void setModelo (String modelo) {
            this.modelo = modelo;
        }

        String getModelo() {
            return modelo;
        }

        void setCapacidadedoTanque (int capacidadedoTanque) {
            this.capacidadedoTanque = capacidadedoTanque;
        }

        int getCapacidadedoTanque() {
            return capacidadedoTanque;
        }

        //Metodo de valor total

        double valorTotaldoTanque(double gasolinaValor) {
            return capacidadedoTanque * gasolinaValor;
        }

    }



