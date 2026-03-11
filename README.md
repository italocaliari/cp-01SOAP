Integrantes do Grupo:

RM: 554758 Nome: Italo Caliari Silva

RM: 554676 Nome: Julio Cesar Ruiz Zequin

RM: 559124 Nome: Bento Rangel Da Silva

RM: 559155 Nome: Thamrs Almeida

RM: 559067 Nome: WerbehKauan Aires Nunes

Estrutura do Projeto
O sistema está dividido em três projetos Maven:

Cp-01 (Servidor/Publisher):

Contém a lógica de negócio e as interfaces JAX-WS.

Publica dois serviços: WineStockService (Estoque) e WineWarningService (Alertas).

Cp-01pt2 (Cliente 1):

Consome o serviço de estoque para listar o menu de vinhos disponível.

Cp-01pt3 (Cliente 2):

Consome ambos os serviços simultaneamente, permitindo realizar pedidos (placeOrder) e verificar alertas de segurança (sendWarn).

Como Executar
1. Pré-requisitos
Java JDK 17 ou superior.

Maven instalado/configurado no IntelliJ IDEA.

2. Passo a Passo
Inicie o Servidor: Abra o projeto Cp-01 e execute a classe Loader.java.

Certifique-se de ver a mensagem "Serviço publicado!" no console.

URLs do WSDL: O servidor estará disponível em:

http://localhost:8085/WineStockService?wsdl

http://localhost:8086/WineWarningService?wsdl

Execute o Cliente 1: No projeto Cp-01pt2, execute a classe ApplicationClient1.java para visualizar o menu.

Execute o Cliente 2: No projeto Cp-01pt3, execute a classe ApplicationClient2.java para testar pedidos e alertas.
