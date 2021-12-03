fun main(args: Array<String>) {

    var zezinho = Student("Zezinho", "da Silva", 123, 70.0, 0)
    var fulaninha = Student("Fulana", "de Tal", 1234, 80.0, 1)
    var vitinho = Student("Vitinho", "Hugo", 12345, 90.0, 1)

    zezinho.nomeCompleto()
    zezinho.mudarAnoSeAprovado()

    val cursoIngles = Couses("Ingles", "Lucinda", 1)

    cursoIngles.cadastrar(fulaninha)
    cursoIngles.cadastrar(vitinho)
    cursoIngles.cadastrar(zezinho)

    cursoIngles.contarEstudantes()

    cursoIngles.removerEstudante(zezinho)

    val estudantes: Array<Student?> = arrayOf(vitinho, fulaninha)

    cursoIngles.cadastrar2(estudantes)

    cursoIngles.contarEstudantes()
}