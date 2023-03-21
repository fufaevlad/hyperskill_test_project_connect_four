fun main() {
    println("Connect Four")
    println("First player's name:")
    val fP = readln()
    println("Second player's name:")
    val sP = readln()
    var rows = 0
    var columns = 0
    val regex = Regex("[0-9]?[0-9](x|х)[0-9]?[0-9]")
    while(true) {
        println("Set the board dimensions (Rows x Columns)")
        println("Press Enter for default (6 x 7)")
        val dem = readln().lowercase().replace("\t", "").replace(" ", "")
        if (dem==""){
            rows = 6
            columns = 7
            println("$fP VS $sP")
            println("$rows x $columns board")
            break
        } else if (dem.trim().matches(regex)){
            val(row, col) = dem.split('x').map{it.trim().toInt()}
            if(row>9||row<5){
                println("Board rows should be from 5 to 9")
            } else if(col>9||col<5) {
                println("Board columns should be from 5 to 9")
            } else if(row<=9&&row>=5&&col<=9&&col>=5){
                rows = row
                columns = col
                println("$fP VS $sP")
                println("$rows x $columns board")
                break
            }

        } else {
            println("Invalid input")
        }
    }

    for (i in 0 until columns){
        print(" ${i+1}")
    }
    println()
    for(j in 0 until rows) {
        for (i in 0..columns) {
            print("| ")
        }
        println()
    }
    for(i in 0..columns*2){
        print("=")
    }
}
