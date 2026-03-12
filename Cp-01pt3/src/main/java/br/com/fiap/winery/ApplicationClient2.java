package br.com.fiap.winery;

import br.com.fiap.winery.stub.*;

public class ApplicationClient2 {
    public static void main(String[] args) {
        try {
            // TESTE PARTE A: O Pedido
            WineStockServiceImplementationService stockFactory = new WineStockServiceImplementationService();
            WineStockService stockPort = stockFactory.getWineStockServiceImplementationPort();

            System.out.println("🚀 Testando Pedido...");
            String resposta = stockPort.placeOrder("Chardonnay", 5);
            System.out.println("Resposta do Servidor: " + resposta);

            // TESTE PARTE B: O Alerta
            WineWarningServiceImplementationService warningFactory = new WineWarningServiceImplementationService();
            WineWarningService warningPort = warningFactory.getWineWarningServiceImplementationPort();

            System.out.println("\nTestando Alerta...");
            System.out.println("Status: " + warningPort.sendWarn());

        } catch (Exception e) {
            System.err.println("Erro: O Servidor Cp-01 está desligado!");
        }
    }
}