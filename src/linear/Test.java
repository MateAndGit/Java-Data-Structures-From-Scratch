package linear;

public class Test {

    public static void main(String[] args) {

        // 1. 리스트 생성 (초기 용량 2로 설정해서 확장이 잘 되는지 확인!)
        MyArrayList<String> list = new MyArrayList<>(2);

        System.out.println("--- 추가 실험 ---");
        list.add("Messi");
        list.add("Di Maria");
        list.add("Otamendi"); // 여기서 grow()가 호출되어야 함!

        System.out.println("현재 크기(size): " + list.size());

        // 2. 조회 실험
        System.out.println("\n--- 조회 실험 ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "번째 선수: " + list.get(i));
        }

        // 3. 삭제 실험
        System.out.println("\n--- 삭제 실험 ---");
        System.out.println("0번째(Messi) 삭제!");
        list.remove(0);

        System.out.println("삭제 후 0번째 선수: " + list.get(0)); // Di Maria가 0번으로 왔어야 함
        System.out.println("현재 크기(size): " + list.size());

        // 4. 예외 테스트 (에러가 나는지 확인)
        list.get(10); // 주석을 풀면 IndexOutOfBoundsException이 발생해야 함!
    }
}
