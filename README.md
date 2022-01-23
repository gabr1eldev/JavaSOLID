<h2>Este é um pequeno projeto como tutorial para demonstrar a utilização e os benefícios de usar os princípios SOLID.</h2>
<h2>SOLID:</h2>
<ul>
   <li><b>S</b>- Princípio da responsabilidade <a href="https://en.wikipedia.org/wiki/Single-responsibility_principle">Única</a></li>
   <li><b>O</b>- Princípio aberto/fechado <a href="https://pt.wikipedia.org/wiki/Princípio_do_aberto/fechado">OCP</a></li>
   <li><b>L</b>- Princípio da substituição de <a href="https://pt.wikipedia.org/wiki/Princípio_da_substituição_de_Liskov">Liskov</a></li>
   <li><b>I</b>- Princípio da segregação da <a href="https://pt.wikipedia.org/wiki/Princípio_da_segregação_de_Interface#:~:text=No%20campo%20da%20engenharia%20de,de%20métodos%20que%20não%20utiliza.&text=O%20ISP%20é%20um%20dos,de%20Alto%20Coesão%20do%20GRASP.">Interface</a></li>
   <li><b>D</b>- Princípio da inversão de <a href="https://pt.wikipedia.org/wiki/Princípio_da_inversão_de_dependência#:~:text=O%20princípio%20estabelece%20que%3A,que%20devem%20depender%20de%20abstrações.">Dependência</a></li>
</ul>
<h2>RESUMO SOLID:</h2>
<ul>
 <li><b>S</b>- Nunca deve haver mais de um motivo para uma classe existir.</li>
 <li><b>O</b>- Aberto para extensão e fechado para modificação</li>
 <li><b>L</b>- Uma classe derivada ela pode e deve ser substituível por sua class base</li>
 <li><b>I</b>- Classes não devem ser forçadas e nem depender de métodos que não irão utilizar</li>
 <li><b>D</b>- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstração</li>
</ul>

<h2>Sobre cada Branch:</h2>

<b><h3>Principio-S</h3></b> 
<h4>Foi criada uma class CRUD onde ela deveria fazer apenas uma única responsabilidade:</br>O sistema de CRUD,
porém no final dos métodos CRUD,existe outro método chamado notificarCliente(),quebrando assim </br> 
o princípio da responsabilidade única. Para corrigir este "erro" criamos uma Notificacao dentro do pacote utility,</br>
separando então da class CRUD e corrigindo o princípio da Responsabilidade única</h4>

<b><h3>Principio-O</h3></b>
<h4>Projeto feito com Herança,onde criamos 3 classes,onde 1 era a class principal que é a class Veículo</br>
e as classes Carro e Moto,onde essas duas classes herdaram da classe mãe Veículo que </br>
vem do princípio aberto para extensão e fechado para modificação,extendendo assim a class Veículo</br>
para Carro e Moto,depois foi criado um enum contendo os valores:CARRO e MOTO,logo em seguida criamos a</br>
class Main onde foi testado dinamicamente os objetos por herança.</h4

<b><h3>Principio-O-Com-Interface</h3></b>
<h4>Aqui foi básicamente o mesmo projeto da branch <strong>Principio-O</strong> sendo que foi feito com </br>
interface em vez de utilizar herança que é do princípio OCP podendo ser com herança ou interfaces</h4>

<b><h3>Principio-L</h3></b>
<h4>Foi criado uma class abstrata Mãe CartaoNubank onde foi implementado a interface Pagamento,</<br>
que tem como métodos de validarCartao e coletarPagamento,depois foi criada as class DebitCard e CreditCard,</br>
que extend da class Mãe CartaoNubank,onde cada um reescreveu o que faz em seus métodos,logo em seguida </br>
foi criada a class Main para testes, até o momento está tudo Ok!.</br>
Agora aplicaremos o Principio de Substituição de Liskov, criamos a class NubankRewards </br>
onde receberá a implementação da interface,agora ao invés de chamar o CreditCard ou DebitCard,</br>
chamaremos o NubankRewards e de acordo com a subistituição de Liskov,</br>
tudo irá funcionar perfeitamente porque fizemos orientado a Inferface,assim não tivemos
que alterar a class NubankCard e apenas implementamos a mesma Interface</h4>

<b><h3>Principio-I</h3></b>
<h4>Primeiro criamos 2 classes Carro e Moto que implementará uma única interface que contém 2 métodos: </br>
criar um carro e criar uma moto,sendo assim quando implementamos essa interface nas duas classes,</br>
ficamos com um método a mais sem usá-lo, a solução é aplicar o Princípio da segregação da</br>
interface,construindo mais 2 interface e dividindo as tarefas,uma para criar carro e outra</br>
para criar  uma moto,evitando assim uma inferface inflada.</h4>
