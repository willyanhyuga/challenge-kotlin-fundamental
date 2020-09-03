import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
  val input = Scanner(System.`in`)

  println("Masukkan Identitas Anda")
  print("Nama: ")
  val nama: String? = input.nextLine()
  if(nama.isNullOrEmpty()){
    main()
  }
  print("Kelas: ")
  val kelas: String? = input.nextLine()
  if(kelas.isNullOrEmpty()){
    main()
  }
  print("Absen: ")
  val absen: String? = input.nextLine()
  println(" ")

  println("!>>MENGHITUNG BANGUN RUANG<<!")
  println("|1. Volume Balok\t\t\t|")
  println("|2. Volume Bola \t\t\t|")
  print("Masukan Menu Pilihan : ")
  val menu = readLine()

  when (menu) {
    "1" -> {
      println(" ")
      println("[]Volume Balok[]")
      print("Masukan Panjang Balok : ")
      val p: Double = input.nextDouble()
      print("Masukan Lebar Balok   : ")
      val l: Double = input.nextDouble()
      print("Masukan Tinggi Balok  : ")
      val t: Double = input.nextDouble()

      //RUMUS Volume BALOK
      val vt: Double = p * l * t;

      println(" ")
      println("Volume Balok adalah = $vt ")

    }
    "2" -> {
      println(" ")
      println("()Volume Bola()")
      print("Masukan jari-jari Bola : ")
      val r: Double = input.nextDouble()

      //Rumus Volume Bola
      val vb: Double = r * r * r * 4 / 3 * 3.14 ;

      println(" ")
      println("Volume Bola adalah = $vb ")

    }
  }
}