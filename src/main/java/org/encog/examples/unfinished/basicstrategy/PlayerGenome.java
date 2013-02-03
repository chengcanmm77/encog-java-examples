/*
 * Encog(tm) Java Examples v3.2
 * http://www.heatonresearch.com/encog/
 * http://code.google.com/p/encog-java/
 
 * Copyright 2008-2012 Heaton Research, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.examples.unfinished.basicstrategy;

import org.encog.ml.ea.genome.BasicGenome;
import org.encog.ml.ea.genome.Genome;
import org.encog.ml.ea.train.EvolutionaryAlgorithm;

public class PlayerGenome extends BasicGenome {

	private Player player;
	//private Chromosome chromosome;
	private int length;
	
	public PlayerGenome(EvolutionaryAlgorithm geneticAlgorithm, Player player) {		
		this.player = player;
		//this.chromosome = new Chromosome();
		
		this.length = player.getRules().length;
		
		for(int i=0;i<length;i++)
		{
			//this.chromosome.add(new CharGene());
		}		
	}


	@Override
	public void copy(Genome source) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public int size() {
		throw new UnsupportedOperationException();
	}


}