import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.nio.Buffer
import java.util.*

class Deepening {
    // 25083

    fun sprout() = with(BufferedReader(InputStreamReader(System.`in`))){
        val bw = BufferedWriter(OutputStreamWriter(System.out))
        bw.write("         ,r'\"7\n")
        bw.write("r`-_   ,'  ,/\n")
        bw.write(" \\. \". L_r'\n")
        bw.write("   `~\\/\n")
        bw.write("      |\n")
        bw.write("      |")
        bw.flush()
        bw.close()
    }

    // 3003  킹, 퀸, 룩, 비숍, 나이트, 폰
    fun subChess() = with (BufferedReader(InputStreamReader(System.`in`))){
        val arr = arrayOf(1,1,2,2,2,8)
        var res  = readLine().split(" ").map { it.toInt() }.toMutableList()

        for (i in arr.indices){
            if(arr[i] != res[i]){
                res[i] = arr[i] - res[i]
            }else{
                res[i] =0
            }
            print("${res[i]} ")
        }
    }

    // 2444 별찍기 -7

    fun printStar() = with(BufferedReader(InputStreamReader(System.`in`))){
        val n = readLine().toInt()
        for(i in 1..n){
            for( j in 0 until n-i){
                 print(" ")
            }
            for( j in 0 until (i-1)*2+1){
                print("*")
            }
            println()
        }
        for( i in n-1 downTo 1){
            for( j in 0 until n-i){
                print(" ")
            }
            for ( j in 0 until (i-1)*2+1){
                print("*")
            }
            println()
        }
    }

    // 10988 팰린드롬인지 확인하기
    fun palindrome() = with (BufferedReader(InputStreamReader(System.`in`))){
        val str : String = readLine()
        var check = true

        while(check){
            for(i in str.indices){
                if(str[i] != str[str.length-i-1]){
                    check = false
                    break
                }
            }
            break
        }
        print( if (check) 1 else 0)
    }

    fun palindrome1() = with(BufferedReader(InputStreamReader(System.`in`))){
        val str  = readLine()
        var sum = 1

        for( i in str.indices){
            if(str[i] != str[str.length-i-1]){
                sum = 0
                break
            }
        }
        print("$sum")
    }

    // 1157 단어공부
    fun printManyAlp() = with(BufferedReader(InputStreamReader(System.`in`))){
        val str = readLine()
        var arr =  mutableMapOf<Char,Int>()

        str.forEach {
            var c = it.lowercaseChar()

            if(arr.containsKey(c)){
                arr[c] = arr[c]!!.plus(1)
            }
            else arr.set(c,1)
        }

        val max = arr.maxBy { it.value }
        if(arr.filter { it.value == max.value}.count() >1){
            println("?")
        }else{
            println(max.key.uppercaseChar())
        }
    }

    // 2941 크로아티아 알파벳
    fun printChangeCro() = with ( BufferedReader(InputStreamReader(System.`in`))){
        val arr = arrayOf("c=", "c-","dz=","d-","lj","nj","s=","z=")
        var x = readLine()

        arr.forEach {
            x = x.replace(it,"!")
        }
        println("${x.length}")
    }
}