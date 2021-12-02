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
<b>Principio-S</b>- <p>Foi criada uma class CRUD onde ela deveria fazer apenas uma única responsabilidade: O sistema de CRUD,</br>
porém no final dos métodos CRUD,existe outro método chamado notificarCliente(),quebrando assim o princípio da responsabilidade única. </br>
Para corrigir este "erro" Notificacao dentro do pacote utility,separando então da class CRUD e corrigindo o princípio da Responsabilidade única </p>
