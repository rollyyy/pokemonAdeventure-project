package pokemonAdventure;

import java.util.Scanner;

public class Pikachu extends PokemonDTO {

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(this.hp < 100) {
			System.out.println("[system] : 피카츄(이)가 전기를 충전합니다. 피카츄의 HP가 100% 충전되었습니다.");
			this.hp = 100;
		} else {
			System.out.println("[system] : 피카츄의 HP가 완충되어 있습니다. 공격을 진행해주세요.");
			
		}
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		if (hp >= 50) { 
			System.out.println("[system] : 피카츄(이)가 10만 볼트를 쏩니다. 피이까===ZZ");
			hp -= 30;
			count++;
			System.out.println("[system] : 피카츄(이)가 " + count+"회 공격을 수행했습니다.");
			System.out.println("[system] : 피카츄의 현재 HP는 " + hp + "입니다." );
			
			if (mission == count) {
				Scanner sc = new Scanner(System.in);
				while(true) {
					System.out.print("[system] : 진화 미션 횟수를 모두 채우셨습니다. 진화를 진행하시겠습니까? (y/n) : ");
					String yesOrNo = sc.nextLine();
					
					if(yesOrNo.equals("y")) {
						System.out.println("[system] : 피카츄(이)가 라이츄(으)로 진화했습니다. 축하드립니다!");
						System.exit(0);
					} else if (yesOrNo.equals("n")) {
						System.out.println("[system] : 진화를 못해 화가 난 피카츄(이)가 집을 나갔습니다ㅠㅠ. 게임을 종료합니다.");
						System.exit(0);
					} else {
						System.out.println("[system] : y/n 중 하나만을 입력해야합니다. 다시 입력해주세요.");
					}
				
				}
			}
		} else { 
			System.out.println("[system] : 피카츄의 HP가 모자라 공격이 불가합니다. 충전을 진행하세요!");
		}
		
	}
	@Override
	public void PokemonDTO() {
		// TODO Auto-generated method stub
		
	}
}