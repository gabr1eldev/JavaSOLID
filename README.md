<h2>Este é um pequeno projeto como tutorial para demonstrar a utilização e os benefícios de usar os princípios SOLID.</h2>
<h3>SOLID:</h3>
<ul>
   <li><b>S</b>- Princípio da responsabilidade <a href="https://en.wikipedia.org/wiki/Single-responsibility_principle">Única</a></li>
   <li><b>O</b>- Princípio aberto/fechado <a href="https://pt.wikipedia.org/wiki/Princípio_do_aberto/fechado">OCP</a></li>
   <li><b>L</b>- Princípio da substituição de <a href="https://pt.wikipedia.org/wiki/Princípio_da_substituição_de_Liskov">Liskov</a></li>
   <li><b>I</b>- Princípio da segregação da <a href="https://pt.wikipedia.org/wiki/Princípio_da_segregação_de_Interface#:~:text=No%20campo%20da%20engenharia%20de,de%20métodos%20que%20não%20utiliza.&text=O%20ISP%20é%20um%20dos,de%20Alto%20Coesão%20do%20GRASP.">Interface</a></li>
   <li><b>D</b>- Princípio da inversão de <a href="https://pt.wikipedia.org/wiki/Princípio_da_inversão_de_dependência#:~:text=O%20princípio%20estabelece%20que%3A,que%20devem%20depender%20de%20abstrações.">Dependência</a></li>
</ul>
<h3>RESUMO SOLID:</h3>
<ul>
 <li><b>S</b>- Nunca deve haver mais de um motivo para uma classe existir.</li>
 <li><b>O</b>- Aberto para extensão e fechado para modificação</li>
 <li><b>L</b>- Uma classe derivada ela pode e deve ser substituível por sua class base</li>
 <li><b>I</b>- Classes não devem ser forçadas e nem depender de métodos que não irão utilizar</li>
 <li><b>D</b>- Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstração</li>
</ul>

<h3>Sobre cada Branch:</h3>
<b>Principio-S</b>- Foi criada uma class CRUD onde ela deveria fazer apenas uma única responsabilidade:</br>O sistema de CRUD,
porém no final dos métodos CRUD,existe outro método chamado notificarCliente(),quebrando assim </br> o princípio da responsabilidade única. 
Para corrigir este "erro"criamos uma Notificacao dentro do pacote utility,</br> separando então da class CRUD e corrigindo o princípio da Responsabilidade única
</br>
<b>Principio-O</>- Projeto feito com Herança,onde criamos 3 classes,onde 1 era a class principal que é a class Veículo</br>
e as classes Carro e Moto,onde essas duas classes herdaram da classe mãe Veículo que vem do princípio aberto para extensão</br>
e fechado para modificação,extendendo assim a class Veículo para Carro e Moto,depois foi criado um enum contendo os valores:
CARRO e MOTO,logo em seguida criamos a class Main onde foi testado dinamicamente os objetos por herança.
</br>
<b>Principio-O-Com-Interface</b>- Aqui foi básicamente o mesmo projeto da branch <b>Principio-O</b> sendo que foi feito com
interface em vez de utilizar herança que é do princípio OCP podendo ser com herança ou interfaces.
