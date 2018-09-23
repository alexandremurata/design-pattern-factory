# design-pattern-factory
FATEC 2018 - Estudo sobre Design Pattern Factory

Um professor de uma faculdade precisa desenvolver um aplicativo para conferência de cálculos simples. Para isso ele convocou um aluno da disciplina de LP II para desenvolver uma solução que possibilite ao mesmo efetuar algumas conferências, a citar:

Conferência do cálculo da área das seguintes figuras geométricas:

Quadrado
Retângulo
Círculo
Triângulo
Paralelograma
Trapézio
Hexágono
Losango
Cubo


Tudo isso através de um ponto único.

O mesmo resolveu nomear este projeto de AreaConferator.

Precisamos ajudá-lo a desenvolver essa solução e para isso usaremos o Eclipse e a plataforma Java.

Mãos à obra!



Obsevação:

Todas classes que representam os objetos deverão implementar a interface abaixo.

public interface Calculable {

      double calcularArea();

}
