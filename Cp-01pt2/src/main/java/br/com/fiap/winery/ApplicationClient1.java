package br.com.fiap.winery;

// Estes imports só funcionam porque você deu 'install' no Maven com sucesso
import br.com.fiap.winery.stub.WineStockService;
import br.com.fiap.winery.stub.WineStockServiceImplementationService;

public class ApplicationClient1 {
    public static void main(String[] args) {
        try {
            // 1. Cria a conexão com o serviço que está rodando no Projeto 1
            WineStockServiceImplementationService service = new WineStockServiceImplementationService();

            // 2. Obtém a porta (o objeto para chamar os métodos)
            WineStockService client = service.getWineStockServiceImplementationPort();

            // 3. Chama o método getMenu e guarda na variável, como pede o roteiro
            String menu = client.getMenu();

            // 4. Imprime o resultado final
            System.out.println("--- RESULTADO RECEBIDO DO WEBSERVICE ---");
            System.out.println(menu);

        } catch (Exception e) {
            System.err.println("ERRO: Verifique se o projeto Cp-01 (Loader) está rodando!");
            e.printStackTrace();
        }
    }
}