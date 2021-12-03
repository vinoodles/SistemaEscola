class Couses (val nomeCurso: String?, var nomeProfessor: String?, var ano: Int){

    val listaEstudantes = mutableListOf<Student?>()

    fun cadastrar(student: Student?)
    {
        listaEstudantes.add(student)
        println("Cadastrado com sucesso")
    }

    fun cadastrar2 (students: Array<Student?>?)
    {
        if (students != null) {
            for (i in students)
            {
                listaEstudantes.add(i)
            }

        }
        println("Estudantes Cadastrados")
    }


    fun removerEstudante (student: Student?)
    {
        if (listaEstudantes.contains(student))
        {
            listaEstudantes.remove(student)
            println("Estudante removido!")
        }
        else
        {
            println("Esse estudante não existe na lista")
        }
    }

    fun contarEstudantes(): Int
    {
        println("O número de estudantes cadastrados no curso é " + listaEstudantes.size)
        return 0
    }

    fun maiorNota()
    {
        var melhorNota = listaEstudantes[0]?.nota

        for (i in listaEstudantes)
        {
            if (i?.nota!! > melhorNota!!)
            {
               melhorNota = i.nota
            }
        }
        println("A maior nota desse curso é $melhorNota")
    }

}