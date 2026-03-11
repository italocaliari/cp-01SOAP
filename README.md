
  <h2>Integrantes do Grupo</h2>
    <ul>
        <li><strong>Italo Caliari Silva</strong> - RM: 554758</li>
        <li><strong>Julio Cesar Ruiz Zequin</strong> - RM: 554676</li>
        <li><strong>Bento Rangel Da Silva</strong> - RM: 559124</li>
        <li><strong>Thamiris Almeida</strong> - RM: 559155</li>
        <li><strong>Werbeth Kauan Aires Nunes</strong> - RM: 559067</li>
    </ul>

  <hr>

  <h2>Estrutura do Projeto</h2>
    <p>O sistema está dividido em três projetos Maven:</p>

  <h3>1. Cp-01 (Servidor/Publisher)</h3>
    <ul>
        <li>Contém a lógica de negócio e as interfaces JAX-WS.</li>
        <li>Publica dois serviços: WineStockService (Estoque) e WineWarningService (Alertas).</li>
    </ul>

  <h3>2. Cp-01pt2 (Cliente 1)</h3>
    <ul>
        <li>Consome o serviço de estoque para listar o menu de vinhos disponível.</li>
    </ul>

  <h3>3. Cp-01pt3 (Cliente 2)</h3>
    <ul>
        <li>Consome ambos os serviços simultaneamente, permitindo realizar pedidos (placeOrder) e verificar alertas de segurança (sendWarn).</li>
    </ul>

  <hr>

  <h2>Como Executar</h2>

  <h3>1. Pré-requisitos</h3>
    <ul>
        <li>Java JDK 17 ou superior.</li>
        <li>Maven instalado e configurado no IntelliJ IDEA.</li>
    </ul>

  <h3>2. Passo a Passo</h3>
    <ol>
        <li><strong>Inicie o Servidor:</strong> Abra o projeto Cp-01 e execute a classe Loader.java. Verifique se a mensagem "Serviço publicado!" aparece no console.</li>
        <li><strong>URLs do WSDL:</strong> O servidor estará disponível em:
            <ul>
                <p><a href="http://localhost:8085/WineStockService?wsdl" target="_blank">http://localhost:8085/WineStockService?wsdl</a></p>

<p> <a href="http://localhost:8086/WineWarningService?wsdl" target="_blank">http://localhost:8086/WineWarningService?wsdl</a></p>
            </ul>
        </li>
        <li><strong>Execute o Cliente 1:</strong> No projeto Cp-01pt2, execute a classe ApplicationClient1.java para visualizar o menu.</li>
        <li><strong>Execute o Cliente 2:</strong> No projeto Cp-01pt3, execute a classe ApplicationClient2.java para testar pedidos e alertas.</li>
    </ol>

  <hr>

  <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Java JAX-WS</li>
        <li>Maven</li>
        <li>IntelliJ IDEA</li>
    </ul>


    
