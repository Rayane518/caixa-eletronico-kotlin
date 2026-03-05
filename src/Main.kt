//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

        var saldo = 0.00
        var sair = false

        while (!sair) {

            println("==============================")
            println(" 1-> depositar / 2-> sacar / 3-> consultar / 999 -> sair")
            println("==============================")
            println("Qual sua opção?")

            var opcao = readLine()?.toInt()

            when (opcao) {

                1 -> {
                    println("Digite o valor que irá ser depositado:")
                    var valor = readLine()!!.toDouble()

                    saldo += valor

                    println("Seu novo saldo é: R$ $saldo")
                }

                2 -> {
                    println("Digite o valor que irá ser sacado:")
                    var valor = readLine()!!.toDouble()

                    if (saldo >= valor) {
                        saldo -= valor
                        println("Seu novo saldo é: R$ $saldo")
                    } else {
                        println("Saldo insuficiente, tente novamente")
                    }
                }

                3 -> {
                    println("Saldo atual: R$ $saldo")
                }

                999 -> {
                    println("Até a próxima!")
                    sair = true
                }

                else -> {
                    println("Opção inválida, tente novamente")
                }
            }
        }
}